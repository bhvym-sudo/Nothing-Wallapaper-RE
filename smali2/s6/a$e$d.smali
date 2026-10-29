.class public final Ls6/a$e$d;
.super Ls6/a$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls6/a$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final s:Ls6/a$e$d;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Ls6/a$e$d;

    invoke-direct {v0}, Ls6/a$e$d;-><init>()V

    sput-object v0, Ls6/a$e$d;->s:Ls6/a$e$d;

    return-void
.end method

.method private constructor <init>()V
    .registers 5

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {p0, v2, v3, v0, v1}, Ls6/a$e;-><init>(IZILkotlin/jvm/internal/h;)V

    return-void
.end method
