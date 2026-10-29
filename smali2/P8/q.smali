.class public interface abstract LP8/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/q$a;
    }
.end annotation


# static fields
.field public static final a:LP8/q$a;

.field public static final b:LP8/q;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    sget-object v0, LP8/q$a;->a:LP8/q$a;

    sput-object v0, LP8/q;->a:LP8/q$a;

    new-instance v0, LP8/q$a$a;

    invoke-direct {v0}, LP8/q$a$a;-><init>()V

    sput-object v0, LP8/q;->b:LP8/q;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Ljava/util/List;
.end method
