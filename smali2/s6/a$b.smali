.class public final Ls6/a$b;
.super Ls6/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final r:Ls6/a$b;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Ls6/a$b;

    invoke-direct {v0}, Ls6/a$b;-><init>()V

    sput-object v0, Ls6/a$b;->r:Ls6/a$b;

    return-void
.end method

.method private constructor <init>()V
    .registers 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Ls6/a;-><init>(ILkotlin/jvm/internal/h;)V

    return-void
.end method
