.class public interface abstract LP8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/b$a;
    }
.end annotation


# static fields
.field public static final a:LP8/b$a;

.field public static final b:LP8/b;

.field public static final c:LP8/b;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    sget-object v0, LP8/b$a;->a:LP8/b$a;

    sput-object v0, LP8/b;->a:LP8/b$a;

    new-instance v0, LP8/b$a$a;

    invoke-direct {v0}, LP8/b$a$a;-><init>()V

    sput-object v0, LP8/b;->b:LP8/b;

    new-instance v0, LR8/a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, LR8/a;-><init>(LP8/q;ILkotlin/jvm/internal/h;)V

    sput-object v0, LP8/b;->c:LP8/b;

    return-void
.end method


# virtual methods
.method public abstract a(LP8/F;LP8/D;)LP8/B;
.end method
