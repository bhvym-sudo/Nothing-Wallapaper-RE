.class public interface abstract LX8/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX8/l$a;
    }
.end annotation


# static fields
.field public static final a:LX8/l$a;

.field public static final b:LX8/l;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    sget-object v0, LX8/l$a;->a:LX8/l$a;

    sput-object v0, LX8/l;->a:LX8/l$a;

    new-instance v0, LX8/l$a$a;

    invoke-direct {v0}, LX8/l$a$a;-><init>()V

    sput-object v0, LX8/l;->b:LX8/l;

    return-void
.end method


# virtual methods
.method public abstract a(ILe9/g;IZ)Z
.end method

.method public abstract b(ILX8/b;)V
.end method

.method public abstract c(ILjava/util/List;)Z
.end method

.method public abstract d(ILjava/util/List;Z)Z
.end method
