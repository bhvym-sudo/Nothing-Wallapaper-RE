.class public abstract Lh8/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh8/w$a;
    }
.end annotation


# static fields
.field public static final q:Lh8/w$a;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lh8/w$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh8/w$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lh8/w;->q:Lh8/w$a;

    return-void
.end method

.method public static d(B)B
    .registers 1

    return p0
.end method
