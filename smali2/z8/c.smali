.class public abstract Lz8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz8/c$a;
    }
.end annotation


# static fields
.field public static final q:Lz8/c$a;

.field private static final r:Lz8/c;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lz8/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lz8/c$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lz8/c;->q:Lz8/c$a;

    sget-object v0, Lp8/b;->a:Lp8/a;

    invoke-virtual {v0}, Lp8/a;->b()Lz8/c;

    move-result-object v0

    sput-object v0, Lz8/c;->r:Lz8/c;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Lz8/c;
    .registers 1

    sget-object v0, Lz8/c;->r:Lz8/c;

    return-object v0
.end method


# virtual methods
.method public abstract b()I
.end method

.method public abstract c(I)I
.end method
