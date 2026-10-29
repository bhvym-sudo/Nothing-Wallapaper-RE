.class public final Lm7/a$b;
.super Lm7/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lm7/a$b;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lm7/a$b;

    invoke-direct {v0}, Lm7/a$b;-><init>()V

    sput-object v0, Lm7/a$b;->a:Lm7/a$b;

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lm7/a;-><init>(Lkotlin/jvm/internal/h;)V

    return-void
.end method
