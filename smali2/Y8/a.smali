.class public interface abstract LY8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY8/a$a;
    }
.end annotation


# static fields
.field public static final a:LY8/a$a;

.field public static final b:LY8/a;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    sget-object v0, LY8/a$a;->a:LY8/a$a;

    sput-object v0, LY8/a;->a:LY8/a$a;

    new-instance v0, LY8/a$a$a;

    invoke-direct {v0}, LY8/a$a$a;-><init>()V

    sput-object v0, LY8/a;->b:LY8/a;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/io/File;)Le9/B;
.end method

.method public abstract b(Ljava/io/File;)Le9/z;
.end method

.method public abstract c(Ljava/io/File;)V
.end method

.method public abstract d(Ljava/io/File;)Z
.end method

.method public abstract e(Ljava/io/File;Ljava/io/File;)V
.end method

.method public abstract f(Ljava/io/File;)V
.end method

.method public abstract g(Ljava/io/File;)Le9/z;
.end method

.method public abstract h(Ljava/io/File;)J
.end method
