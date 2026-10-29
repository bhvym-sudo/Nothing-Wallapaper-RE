.class public abstract Li8/j;
.super Li8/b;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;
.implements Lw8/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/j$a;
    }
.end annotation


# static fields
.field public static final q:Li8/j$a;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Li8/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li8/j$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Li8/j;->q:Li8/j$a;

    return-void
.end method

.method protected constructor <init>()V
    .registers 1

    invoke-direct {p0}, Li8/b;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 3

    if-ne p1, p0, :cond_4

    const/4 p0, 0x1

    return p0

    :cond_4
    instance-of v0, p1, Ljava/util/Set;

    if-nez v0, :cond_a

    const/4 p0, 0x0

    return p0

    :cond_a
    sget-object v0, Li8/j;->q:Li8/j$a;

    check-cast p1, Ljava/util/Set;

    invoke-virtual {v0, p0, p1}, Li8/j$a;->a(Ljava/util/Set;Ljava/util/Set;)Z

    move-result p0

    return p0
.end method

.method public hashCode()I
    .registers 2

    sget-object v0, Li8/j;->q:Li8/j$a;

    invoke-virtual {v0, p0}, Li8/j$a;->b(Ljava/util/Collection;)I

    move-result p0

    return p0
.end method
