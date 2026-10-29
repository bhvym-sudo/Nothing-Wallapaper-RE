.class public interface abstract LP8/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/n$a;
    }
.end annotation


# static fields
.field public static final a:LP8/n$a;

.field public static final b:LP8/n;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    sget-object v0, LP8/n$a;->a:LP8/n$a;

    sput-object v0, LP8/n;->a:LP8/n$a;

    new-instance v0, LP8/n$a$a;

    invoke-direct {v0}, LP8/n$a$a;-><init>()V

    sput-object v0, LP8/n;->b:LP8/n;

    return-void
.end method


# virtual methods
.method public abstract a(LP8/v;Ljava/util/List;)V
.end method

.method public abstract b(LP8/v;)Ljava/util/List;
.end method
